// How to find duplicates in Java array?
 for (int i = 0; i < names.length; i++) {
     for (int j = i + 1 ; j < names.length; j++) {
          if (names[i].equals(names[j])) {
                   // got the duplicate element
          }
     }
 }


