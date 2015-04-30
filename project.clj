(defproject friboo-hello-world "0.1.0-SNAPSHOT"
  :description "Hello world example app."
  :url "https://github.com/hjacobs/friboo-hello-world"

  :license {:name "The Apache License, Version 2.0"
            :url  "http://www.apache.org/licenses/LICENSE-2.0"}

  :min-lein-version "2.0.0"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.zalando.stups/friboo "0.8.0"]]

  :main ^:skip-aot helloworld.core
  :uberjar-name "friboo-hello-world.jar"

  :plugins [[io.sarnowski/lein-docker "1.1.0"]]

  :docker {:image-name "helloworld"}

  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag"]
                  ["clean"]
                  ["uberjar"]
                  ["docker" "build"]
                  ["docker" "push"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]]

  :pom-addition [:developers
                 [:developer {:id "hjacobs"}
                  [:name "Henning Jacobs"]
                  [:email "henning@jacobs1.de"]
                  [:role "Maintainer"]]]

  :profiles {:uberjar {:aot :all}

             :dev     {:repl-options {:init-ns user}
                       :source-paths ["dev"]
                       :dependencies [[org.clojure/tools.namespace "0.2.10"]
                                      [org.clojure/java.classpath "0.2.2"]]}})
