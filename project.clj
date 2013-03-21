(defproject testApp "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.2.1-SNAPSHOT"]
                 [ring/ring "1.1.0"]]
  :dev-dependencies [[ring/ring-devel "1.2.0-SNAPSHOT"]]
  :plugins [[lein-ring "0.8.3"]]
  :ring {:handler testApp.core/app})
