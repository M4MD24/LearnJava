[//]: # (Notes)

# Information

| Dictionary                                                                | Hashtable                                                            |
|---------------------------------------------------------------------------|----------------------------------------------------------------------|
| It returns error if we try to find a key which does not exist             | It returns null if we try to find a key which does not exist         |
| It is faster than a Hashtable because there is no boxing and unboxing     | It is slower than dictionary because it requires boxing and unboxing |
| Only public static members are thread safe                                | All the members in a Hashtable are thread safe                       |
| Dictionary is a generic type which means we can use it with any data type | Hashtable is not a generic type                                      |