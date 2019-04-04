(defun linear-search (list item)
  (loop for pos from 0 and element in list
    when (eql item element)
      do (return pos)))

(format t "Enter the list of integers: ")
(setq list (read-from-string (concatenate 'string "(" (read-line) ")")))

(format t "Enter the integer to search for: ")
(setq item (read-from-string (concatenate 'string (read-line))))

(setq result (linear-search list item))
(format t (concatenate 'string "Position of integer in array (0-indexed): " (write-to-string result)))

;; (write (linear-search '(2 3 5 7 11 13 17 19) 19))