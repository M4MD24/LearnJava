[//]: # (Notes)

# Information

| B Tree                                                                                                             | B+ Tree                                                                                           |
|--------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|
| Search keys can not be repeatedly stored                                                                           | Redundant search keys can be present                                                              | 
| Data can be stored in leaf nodes as well as internal nodes                                                         | Data can only be stored on the leaf nodes                                                         |
| Searching for some data is a slower process since data can be found on internal nodes as well as on the leaf nodes | Searching is comparatively faster as data can only be found on the leaf nodes                     |
| Deletion of internal nodes are so complicated and time consuming                                                   | Deletion will never be a complex process since element will always be deleted from the leaf nodes |
| Leaf nodes can not be linked together                                                                              | Leaf nodes are linked together to make the search operations more efficient                       |