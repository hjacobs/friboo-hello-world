(ns helloworld.api
  (:require [org.zalando.stups.friboo.system.http :refer [def-http-component]]
            [ring.util.response :refer :all]
            [org.zalando.stups.friboo.ring :refer :all]
            [clojure.tools.logging :as log]))

; define the API component and its dependencies
(def-http-component API "api.yaml" [db])

(def default-http-configuration
  {:http-port 8080})

(defn index [request _ _]
  (-> "Hello World!"
      (response)
      (content-type-json)))

(defn say-hello [{:keys [who]} _ _]
  (log/debug "Saying hello")
  (-> (str "Hello " who)
      (response)
      (content-type-json)))
