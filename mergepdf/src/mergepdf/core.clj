(ns mergepdf.core
  (:gen-class)
  (:require 
    [clojure.string :refer [ends-with?]]
    [pdfboxing.merge :refer [merge-pdfs]]))

(def dirfiles (file-seq (clojure.java.io/file "./")))

; couple of utility functions shamelessly stolen from clojure cookbook    

(defn only-files
  "Filter a sequence of files/directories by the .isFile property of
  java.io.File"
  [file-s]
  (filter #(.isFile %) file-s))

(defn names
  "Return the .getName property of a sequence of files"
  [file-s]
  (map #(.getName %) file-s))

(defn only-pdfs
  "filter sequence of filenames for ends with .pdf"
  [filenames-s]
  (filter #(ends-with? % ".pdf") filenames-s))
    
(defn -main
  "I don't do a whole lot ... yet."
  [outfile]
  (merge-pdfs :input (-> dirfiles only-files names only-pdfs) :output outfile))
