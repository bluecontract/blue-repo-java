package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EYefzghnkcwGyDnA7yRkuApYJ3pz13zmS1jhZmJnKKsK")
public class CustomisedWorkflow {
    public static String blueId() {
        return "EYefzghnkcwGyDnA7yRkuApYJ3pz13zmS1jhZmJnKKsK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CustomisedWorkflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CustomisedWorkflow";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CustomisedWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private String itemName;

    private String itemValue;

    public String getNamespace() {
        return namespace;
    }

    public CustomisedWorkflow namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public CustomisedWorkflow itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public String getItemValue() {
        return itemValue;
    }

    public CustomisedWorkflow itemValue(String itemValue) {
        this.itemValue = itemValue;
        return this;
    }

}
