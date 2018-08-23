# RegK-Means
```
    Leandro Miranda [leandromiranda@id.uff.br]
    José Viterbo [viterbo@ic.uff.br]
    Flávia Bernardini [fcbernardini@gmail.com]
    
    This file is part of RegK-Means.
    
    Copyright (c) by
    Leandro Miranda, José Viterbo, Flávia Bernardini, 2017.
```

RegK-Means is an algorithm containing an object-oriented Java implementation based on [WEKA](https://www.cs.waikato.ac.nz/ml/weka/) for Spatially contiguity Clustering, essentially for Regionalization problems.

Based on K-Means, RegK-Means algorithm for solving regionalization problems. This algorithm adopts the following criteria: objects can only belong to the same region — or cluster — if these objects are spatially adjacent.

# Description

The following objects are implemented on project:

* Initialization Methods: 
  - Canopy;
  - Farthest First;
  - random;
  - KMeans++.

* Format of dataset: .arff ( like WEKA)

* Further, RegK-Means includes implementations (based on WEKA project) of:
  - DenseInstance.java implemented in python by Roland Memisevic 2008, following minimize.m which is copyright (C) 1999 - 2006, Carl Edward Rasmussen
  - DistanceFunction.java (Copyright (c) Ian T Nabney (1996-2001))
  - EuclideanDistance.java (Copyright (c) by Hannes Nickisch 2010-01-10.)
  - Instance.java
  - Instance.java
  - ManhattanDistance.java
  
  The sources are presented on WEKA project, too. However, there are some changes due to RegK-Means implementation. 




# Requirements
WEKA 3.7.1 or above

# Acknowledgements

Fluminense Federal University by all infrastructure for this research.

This work is partly supported by the Coordination for the Improvement of Higher Education Personnel (CAPES), Process 1420465.

# Citation

```
@inproceedings{miranda2017regk,
  title={RegK-Means: A clustering algorithm using spatial contiguity constraints for regionalization problems},
  author={Miranda, Leandro and Viterbo Filho, Jos{\'e} and Bernardini, Flavia Cristina},
  booktitle={Intelligent Systems (BRACIS), 2017 Brazilian Conference on},
  pages={31--36},
  year={2017},
  organization={IEEE}
}
```




