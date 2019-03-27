(defun linear-search (list item)
  (loop for pos from 0 and element in list
        when (eql item element)
          do (return pos)))
 
(write (linear-search '(2 3 5 7 11 13 17 19) 19))