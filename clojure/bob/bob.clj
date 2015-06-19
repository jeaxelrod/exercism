(ns bob
  (:require [clojure.string :as str]))

(defn- lastChar [str]
  (get str (- (.length str) 1)))

(defn- forceful [talk]
  (if (re-find #"[A-Z]" talk)
    (= talk (str/upper-case talk))))

(defn- question [talk]
  (= (lastChar talk) \?))

(defn- silence [talk]
  (str/blank? talk))

(defn response-for [talk]
  (cond
    (silence talk)  "Fine. Be that way!"
    (forceful talk) "Whoa, chill out!"
    (question talk) "Sure."
    :else           "Whatever."))
