import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(includeClasses = { A.class }, schemaPackageName = "example")
interface ProtoStreamContextInitializer extends SerializationContextInitializer {
}
