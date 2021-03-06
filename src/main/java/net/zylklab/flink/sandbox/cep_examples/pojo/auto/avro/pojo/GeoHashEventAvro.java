/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GeoHashEventAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -815085566729786408L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeoHashEventAvro\",\"namespace\":\"net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo\",\"fields\":[{\"name\":\"geohash\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"totalGPRSEvents\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GeoHashEventAvro> ENCODER =
      new BinaryMessageEncoder<GeoHashEventAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GeoHashEventAvro> DECODER =
      new BinaryMessageDecoder<GeoHashEventAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GeoHashEventAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GeoHashEventAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GeoHashEventAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GeoHashEventAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GeoHashEventAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GeoHashEventAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GeoHashEventAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GeoHashEventAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String geohash;
  @Deprecated public java.lang.Integer totalGPRSEvents;
  @Deprecated public java.lang.Long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeoHashEventAvro() {}

  /**
   * All-args constructor.
   * @param geohash The new value for geohash
   * @param totalGPRSEvents The new value for totalGPRSEvents
   * @param timestamp The new value for timestamp
   */
  public GeoHashEventAvro(java.lang.String geohash, java.lang.Integer totalGPRSEvents, java.lang.Long timestamp) {
    this.geohash = geohash;
    this.totalGPRSEvents = totalGPRSEvents;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return geohash;
    case 1: return totalGPRSEvents;
    case 2: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: geohash = (java.lang.String)value$; break;
    case 1: totalGPRSEvents = (java.lang.Integer)value$; break;
    case 2: timestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'geohash' field.
   * @return The value of the 'geohash' field.
   */
  public java.lang.String getGeohash() {
    return geohash;
  }


  /**
   * Sets the value of the 'geohash' field.
   * @param value the value to set.
   */
  public void setGeohash(java.lang.String value) {
    this.geohash = value;
  }

  /**
   * Gets the value of the 'totalGPRSEvents' field.
   * @return The value of the 'totalGPRSEvents' field.
   */
  public java.lang.Integer getTotalGPRSEvents() {
    return totalGPRSEvents;
  }


  /**
   * Sets the value of the 'totalGPRSEvents' field.
   * @param value the value to set.
   */
  public void setTotalGPRSEvents(java.lang.Integer value) {
    this.totalGPRSEvents = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Creates a new GeoHashEventAvro RecordBuilder.
   * @return A new GeoHashEventAvro RecordBuilder
   */
  public static net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder newBuilder() {
    return new net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder();
  }

  /**
   * Creates a new GeoHashEventAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeoHashEventAvro RecordBuilder
   */
  public static net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder newBuilder(net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder other) {
    if (other == null) {
      return new net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder();
    } else {
      return new net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder(other);
    }
  }

  /**
   * Creates a new GeoHashEventAvro RecordBuilder by copying an existing GeoHashEventAvro instance.
   * @param other The existing instance to copy.
   * @return A new GeoHashEventAvro RecordBuilder
   */
  public static net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder newBuilder(net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro other) {
    if (other == null) {
      return new net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder();
    } else {
      return new net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for GeoHashEventAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeoHashEventAvro>
    implements org.apache.avro.data.RecordBuilder<GeoHashEventAvro> {

    private java.lang.String geohash;
    private java.lang.Integer totalGPRSEvents;
    private java.lang.Long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.geohash)) {
        this.geohash = data().deepCopy(fields()[0].schema(), other.geohash);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.totalGPRSEvents)) {
        this.totalGPRSEvents = data().deepCopy(fields()[1].schema(), other.totalGPRSEvents);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing GeoHashEventAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.geohash)) {
        this.geohash = data().deepCopy(fields()[0].schema(), other.geohash);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.totalGPRSEvents)) {
        this.totalGPRSEvents = data().deepCopy(fields()[1].schema(), other.totalGPRSEvents);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'geohash' field.
      * @return The value.
      */
    public java.lang.String getGeohash() {
      return geohash;
    }


    /**
      * Sets the value of the 'geohash' field.
      * @param value The value of 'geohash'.
      * @return This builder.
      */
    public net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder setGeohash(java.lang.String value) {
      validate(fields()[0], value);
      this.geohash = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'geohash' field has been set.
      * @return True if the 'geohash' field has been set, false otherwise.
      */
    public boolean hasGeohash() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'geohash' field.
      * @return This builder.
      */
    public net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder clearGeohash() {
      geohash = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalGPRSEvents' field.
      * @return The value.
      */
    public java.lang.Integer getTotalGPRSEvents() {
      return totalGPRSEvents;
    }


    /**
      * Sets the value of the 'totalGPRSEvents' field.
      * @param value The value of 'totalGPRSEvents'.
      * @return This builder.
      */
    public net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder setTotalGPRSEvents(java.lang.Integer value) {
      validate(fields()[1], value);
      this.totalGPRSEvents = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'totalGPRSEvents' field has been set.
      * @return True if the 'totalGPRSEvents' field has been set, false otherwise.
      */
    public boolean hasTotalGPRSEvents() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'totalGPRSEvents' field.
      * @return This builder.
      */
    public net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder clearTotalGPRSEvents() {
      totalGPRSEvents = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder setTimestamp(java.lang.Long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public net.zylklab.flink.sandbox.cep_examples.pojo.auto.avro.pojo.GeoHashEventAvro.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GeoHashEventAvro build() {
      try {
        GeoHashEventAvro record = new GeoHashEventAvro();
        record.geohash = fieldSetFlags()[0] ? this.geohash : (java.lang.String) defaultValue(fields()[0]);
        record.totalGPRSEvents = fieldSetFlags()[1] ? this.totalGPRSEvents : (java.lang.Integer) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GeoHashEventAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<GeoHashEventAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GeoHashEventAvro>
    READER$ = (org.apache.avro.io.DatumReader<GeoHashEventAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.geohash == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.geohash);
    }

    if (this.totalGPRSEvents == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.totalGPRSEvents);
    }

    if (this.timestamp == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.timestamp);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.geohash = null;
      } else {
        this.geohash = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.totalGPRSEvents = null;
      } else {
        this.totalGPRSEvents = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.timestamp = null;
      } else {
        this.timestamp = in.readLong();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.geohash = null;
          } else {
            this.geohash = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.totalGPRSEvents = null;
          } else {
            this.totalGPRSEvents = in.readInt();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.timestamp = null;
          } else {
            this.timestamp = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










