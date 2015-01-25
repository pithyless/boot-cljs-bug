```
Boot App Version: 2.0.0-rc4
Boot Lib Version: 2.0.0-rc8
Clojure Version:  1.6.0

$BOOT_JVM_OPTIONS =  -client -Xmx2g -XX:+TieredCompilation -XX:TieredStopAtLevel=1 -Xverify:none
```

Error:

```
› boot dev
Adding cljsjs/common/react-externs.ext.js to fileset
Adding cljsjs/development/react.inc.js to fileset
Writing main.cljs.edn...
             clojure.lang.ExceptionInfo: java.lang.IllegalArgumentException: No matching field found: getPath for class java.lang.String
    data: {:file
           "../var/folders/pw/cc11xr3132v721nk375rlw5c0000gn/T/boot.user2439787072593876441.clj",
           :line 13}
java.util.concurrent.ExecutionException: java.lang.IllegalArgumentException: No matching field found: getPath for class java.lang.String
     java.lang.IllegalArgumentException: No matching field found: getPath for class java.lang.String
                                         ...
adzerk.boot-cljs.middleware/shim/rooted-path                    middleware.clj:  154
                        clojure.core/mapv/fn                          core.clj: 6353
                   clojure.core.protocols/fn                     protocols.clj:  127
                 clojure.core.protocols/fn/G                     protocols.clj:   19
           clojure.core.protocols/seq-reduce                     protocols.clj:   31
                   clojure.core.protocols/fn                     protocols.clj:   48
                 clojure.core.protocols/fn/G                     protocols.clj:   13
                         clojure.core/reduce                          core.clj: 6289
                           clojure.core/mapv                          core.clj: 6353
            adzerk.boot-cljs.middleware/shim                    middleware.clj:  155
               adzerk.boot-cljs/prep-compile                     boot_cljs.clj:   52
        adzerk.boot-cljs/eval254/fn/fn/fn/fn                     boot_cljs.clj:  133
           adzerk.boot-cljs/eval254/fn/fn/fn                     boot_cljs.clj:  129
           adzerk.boot-cljs/eval230/fn/fn/fn                     boot_cljs.clj:   81
         cljsjs.boot-cljsjs/eval339/fn/fn/fn                   boot_cljsjs.clj:   30
                         boot.core/run-tasks                          core.clj:  623
                                         ...
                        boot.user/eval447/fn  boot.user2439787072593876441.clj:   15
         clojure.core/binding-conveyor-fn/fn                          core.clj: 1910
```
