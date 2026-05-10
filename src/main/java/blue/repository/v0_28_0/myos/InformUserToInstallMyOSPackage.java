package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("CrGV4ZYjvPvMqrgNQAfgZCUnFjFW6HDjYNdon2chLKU3")
public class InformUserToInstallMyOSPackage {
    public static String blueId() {
        return "CrGV4ZYjvPvMqrgNQAfgZCUnFjFW6HDjYNdon2chLKU3";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Inform User To Install MyOS Package";
    }

    public static String qualifiedName() {
        return "MyOS/Inform User To Install MyOS Package";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/InformUserToInstallMyOSPackage.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String title;

    private String message;

    // Original Blue property name: package
    @JsonProperty("package")
    private MyOSPackage packageValue;

    public String getTitle() {
        return title;
    }

    public InformUserToInstallMyOSPackage title(String title) {
        this.title = title;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public InformUserToInstallMyOSPackage message(String message) {
        this.message = message;
        return this;
    }

    public MyOSPackage getPackageValue() {
        return packageValue;
    }

    public InformUserToInstallMyOSPackage packageValue(MyOSPackage packageValue) {
        this.packageValue = packageValue;
        return this;
    }

}
