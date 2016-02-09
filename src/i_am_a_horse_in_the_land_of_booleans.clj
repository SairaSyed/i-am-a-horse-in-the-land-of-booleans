(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil)
          (= x false))
    false
    true))

(boolean "foo")   ;=> true
(boolean nil)     ;=> false

; Exercise 1
(boolean "foo") ;=> true
(boolean nil) ;=> false
(boolean (+ 2 3)) ;=> true
(boolean true) ;=> true
(boolean false) ;=> false


; Exercise 3

(defn abs [x]
  (if (< x 0)
    (- x)
    x ))

(abs -2)


; Exercise 4
(defn divides? [divisor  n]
  (= 0 (mod n divisor)))

(divides? 2 4) ;=> true
(divides? 4 2) ;=> false
(divides? 5 10) ;=> true
(divides? 2 5) ;=> false

(defn fizzbuzz [n]
  ":(")

; Exercise 2


(defn teen? [age]
  (if (and (<= age 19)
          (>= age 13))
      true
      false) )
(teen? 12) ;=> false
(teen? 15) ;=> true
(teen? 19) ;=> true
(teen? 20) ;=> false
(teen? 27) ;=> false


(defn not-teen? [age]
  (if (or (>= age 19)
           (<= age 13))
    true
    false ))

(not-teen? 10)
(not-teen? 20)

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'


