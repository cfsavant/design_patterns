#Static Facotry Naming Convention
Names for static factory methods. This list is far from exhaustive:

**from** -- type-conversion method

    single parameter,returns a corresponding instance of this type,

    example:
    Date d = Date.from(instant)

**of**  -- aggregation method 

    multiple parameters, returns an instance of this type that incorporates them
    example:
    Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

**valueOf** — more verbose alternative to from and of

    BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

**instance or getInstance** -- Returns an instance that is described by its parameters    
    
    (if any) but cannot be said to have the same value.
    StackWalker luke = StackWalker.getInstance(options);

**create or newInstance** -- Like instance or getInstance,
except that the method guarantees that each call returns a new instance
    
    Object newArray = Array.newInstance(classObject, arrayLen);

**getType** -— Like getInstance
but used if the factory method is in a different class.
Type is the type of object returned by the factory method

    FileStore fs = Files.getFileStore(path);

**newType** -— Like newInstance
but used if the factory method is in a different class. Type is the type of object returned by the factory method,
BufferedReader br = Files.newBufferedReader(path);

**type** -- A concise alternative to getType and newType,

    List<Complaint> litany = Collections.list(legacyLitany);

