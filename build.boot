(set-env!
 :source-paths   #{"src"}
 :resource-paths #{"html"}
 :dependencies '[[adzerk/boot-cljs      "0.0-2629-9" :scope "test"]
                 [cljsjs/boot-cljsjs    "0.4.1"      :scope "test"]

                 [cljsjs/react          "0.12.2-3"]
                 ; [reagent               "0.5.0-alpha"]
                 ])

(require
 '[adzerk.boot-cljs      :refer [cljs]]
 '[cljsjs.boot-cljsjs    :refer [from-cljsjs]])

(deftask build-dev []
  (comp
    (from-cljsjs :profile :development)
    (cljs :source-map true
          :optimizations :none)))

(deftask dev
 "Start the dev env..."
 []
 (comp
   (build-dev)))
