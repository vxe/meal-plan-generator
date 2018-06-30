(defproject meal-plan-generator "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cheshire "5.8.0"]
                 [org.clojure/tools.logging "0.2.4"]
                 [org.slf4j/slf4j-log4j12 "1.7.1"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]

                 [com.rpl/specter "1.1.0"]
                 [clj-http "3.8.0"]
                 [clojure.java-time "0.3.1"]
                 [ring "1.6.3"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [ring/ring-devel "1.6.3"]
                 [ring/ring-json "0.4.0"]
                 [ring-middleware "0.1.0-SNAPSHOT"]
                 [liberator "0.15.1"]
                 [incanter "1.9.2"]
                 [com.cemerick/url "0.1.1"]
                 [ubergraph "0.5.0"]
                 [clucie "0.4.0"]
                 [io.forward/yaml "1.0.8"]
                 [datascript "0.16.6"]]
  :main ^:skip-aot meal-plan-generator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
