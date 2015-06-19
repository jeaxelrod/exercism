(ns rna-transcription)

(defn- translate [nucleotide]
  (case nucleotide
    \G \C
    \C \G
    \T \A
    \A \U
    (throw (AssertionError. "Invalid DNA sequence"))))
    
(defn to-rna [dna]
  (apply str (map translate (seq dna))))
