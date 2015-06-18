(ns bob)

(defn- forceful [talk]
  (if (re-find #"[A-Z]" talk)
    (= talk (clojure.string/upper-case talk))
    false
  )
)

(defn- question [talk]
  (= (get talk 
          (- (.length talk) 1)) 
     \?)
)

(defn- silence [talk]
  (clojure.string/blank? talk)
)

(defn response-for [talk]
  (if (silence talk)
    "Fine. Be that way!"
    (if (forceful talk)
      "Whoa, chill out!"
      (if (question talk)
        "Sure."
        "Whatever."
      )
    )
  )
)
