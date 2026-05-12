package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8eyv5ogjHbTqUeaJKWHMenLs3MaCnpGSQkbPrCqvk2Ga")
public class AnchorAutomationTemplate {
    public static String blueId() {
        return "8eyv5ogjHbTqUeaJKWHMenLs3MaCnpGSQkbPrCqvk2Ga";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Anchor Automation Template";
    }

    public static String qualifiedName() {
        return "MyOS/Anchor Automation Template";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/AnchorAutomationTemplate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
