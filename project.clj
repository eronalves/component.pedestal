(defproject grzm/component.pedestal "0.0.1-SNAPSHOT"
  :description "Pedestal service wrapper for Component systems"
  :url "https://github.com/grzm/component.pedestal"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[com.stuartsierra/component  "0.3.2"]
                 [org.clojure/clojure "1.8.0" :scope "provided"]
                 [io.pedestal/pedestal.service "0.5.2" :scope "provided"]
                 [ring/ring-mock "0.3.0"]])
