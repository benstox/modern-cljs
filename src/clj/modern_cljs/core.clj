(ns modern-cljs.core
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found files resources]]))

(defroutes handler
  (GET "/" [] "Hello from Compojure!") ;; fpr testing only
  (files "/" {:root "target"})        ;; to serve static resources
  (resources "/" {:root "target"})    ;; to serve anything else
  (not-found "Page not found"))       ;; page not found
