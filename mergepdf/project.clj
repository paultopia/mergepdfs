(defproject mergepdf "0.1.0-SNAPSHOT"
  :description "simply merge all pdfs in directory in alphabetical order"
  :url "http://github.com/paultopia/mergepdfs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"] [pdfboxing "0.1.9"]]
  :main mergepdf.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
