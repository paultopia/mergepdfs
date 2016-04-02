def dirfiles (file-seq (clojure.java.io/file "./")))

(defn only-files
  "Filter a sequence of files/directories by the .isFile property of
  java.io.File"
  [file-s]
  (filter #(.isFile %) file-s))

  (defn names
  "Return the .getName property of a sequence of files"
  [file-s]
  (map #(.getName %) file-s))
  
  (use clojure.string)
  
  (defn only-pdfs
    [file-s]
    (filter #(ends-with? '.pdf' %) file-s)