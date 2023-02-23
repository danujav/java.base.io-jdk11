# java.base.io-jdk11

#### Here I talk about JAVA Input and Output

## Stream
###### All the Java Input and Output are depend on this IO Stream Concept.
###### Conceptually, a stream is a sequence of data.(endless flow of data)


### Two types of data streams exist.
        # 1. Byte Stream (Reading and Writing Stream as Byte):8bit 
        # 2. Character Stream (Reading and Writing Stream as Character):16bit

##### A stream has always been connected to either a source or a destination.
![IO class Diagram.Streams.png](src/main/resources/readme/IO%20class%20Diagram.Streams.png)

> #### 1. Character Stream
###### Use the Java Classes in the following java.base.io package to `read or write` your data as a `Character Stream(Sequence of data)`.

![IO class Diagram.Reader.png](src/main/resources/readme/IO%20class%20Diagram.Reader.png)

---

![IO class Diagram.Writer.png](src/main/resources/readme/IO%20class%20Diagram.Writer.png)

> #### 2. Byte Stream
###### Use the Java Classes in the following java.base.io package to `Input or Output` your data as a `Byte Stream(Sequence of data)`.
![IO class Diagram.InputStream.png](src/main/resources/readme/IO%20class%20Diagram.InputStream.png)

---

![IO class Diagram.OutputStream.png](src/main/resources/readme/IO%20class%20Diagram.OutputStream.png)