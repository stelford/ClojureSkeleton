(ns testApp.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler])
   (:use ring.middleware.session)
   (:use ring.adapter.jetty))

(defn helloWorld []
  "<p>Hello Compojure!</p>"
  {:body (str "<p>Hello Compojure!</p>")})
  
(defroutes my-routes
  (GET "/" {} (helloWorld))
  (route/files "/") ; look in /public for static files
  (route/not-found "Page not found"))

; compojure example
(def app (-> #'my-routes ))
