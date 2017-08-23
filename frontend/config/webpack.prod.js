const helpers = require('./helpers');
const path = require('path');
const webpack = require('webpack');
const webpackMerge = require('webpack-merge'); // used to merge webpack configs
const commonConfig = require('./webpack.common.js'); // the settings that are common to prod and dev

// Webpack Plugins
const ExtractTextPlugin = require('extract-text-webpack-plugin');
const autoprefixer = require('autoprefixer');
const CopyWebpackPlugin = require('copy-webpack-plugin');

const ENV = process.env.ENV = process.env.NODE_ENV = 'production';

console.log('Build production version');

module.exports = function (options) {
    return webpackMerge(commonConfig({env: ENV}), {
        devtool: 'source-map',

        output: {
            path: helpers.root('dist'),
            publicPath: '/',
            filename: 'js/[name].[hash].js',
            chunkFilename: '[id].[hash].chunk.js'
        },

        module: {
            rules: [
                // Support for .ts files.
                {
                    test: /\.ts$/,
                    use: [
                        {
                            loader: '@angularclass/hmr-loader',
                            options: {
                                pretty: false,
                                prod: true
                            }
                        }, {
                            // MAKE SURE TO CHAIN VANILLA JS CODE, I.E. TS COMPILATION OUTPUT.
                            loader: 'ng-router-loader',
                            options: {
                                loader: 'async-import',
                                genDir: 'compiled',
                            }
                        }, {
                            loader: 'awesome-typescript-loader',
                            options: {
                                configFileName: 'tsconfig.webpack.json'
                            }                        
                        }, {
                            loader: 'angular2-template-loader'
                        }
                    ],
                    exclude: [/\.(spec|e2e)\.ts$/]
                },
                // Support for CSS as raw text
                // all css in src/style will be bundled in an external css file
                {
                    test: /\.css$/,
                    exclude: helpers.root('src', 'app'),
                    loader: ExtractTextPlugin.extract({
                        fallback: 'style-loader', 
                        use: ['css-loader', 'postcss-loader']}
                    )
                },
                // all css required in src/app files will be merged in js files
                {
                    test: /\.css$/,
                    include: helpers.root('src', 'app'),
                    loader: 'raw-loader!postcss-loader'
                },

                // support for .scss files
                // all css in src/style will be bundled in an external css file
                {
                    test: /\.(scss|sass)$/,
                    exclude: helpers.root('src', 'app'),
                    loader: ExtractTextPlugin.extract({
                        fallback: 'style-loader', 
                        use: ['css-loader', 'postcss-loader', 'sass-loader']}
                    )
                },
                // all css required in src/app files will be merged in js files
                {
                    test: /\.(scss|sass)$/,
                    exclude: helpers.root('src', 'style'),
                    loader: 'raw-loader!postcss-loader!sass-loader'
                },
            ]
        },

        plugins: [
            new webpack.LoaderOptionsPlugin({
                options: {
                    sassLoader: {
                        //includePaths: [path.resolve(__dirname, "node_modules/foundation-sites/scss")]
                    },
                }
            }),

            // Extract css files
            // Reference: https://github.com/webpack/extract-text-webpack-plugin
            new ExtractTextPlugin({filename: 'css/[name].[hash].css'}),

            // Only emit files when there are no errors
            new webpack.NoEmitOnErrorsPlugin(),

            // // Reference: http://webpack.github.io/docs/list-of-plugins.html#dedupeplugin
            // // Dedupe modules in the output
            // new webpack.optimize.DedupePlugin(),

            // Reference: http://webpack.github.io/docs/list-of-plugins.html#uglifyjsplugin
            // Minify all javascript, switch loaders to minimizing mode
            new webpack.optimize.UglifyJsPlugin({sourceMap: true, mangle: { keep_fnames: true }}),

            // Copy assets from the public folder
            // Reference: https://github.com/kevlened/copy-webpack-plugin
            new CopyWebpackPlugin([{
                from: helpers.root('src')
            }]),
        ],
    });
}
