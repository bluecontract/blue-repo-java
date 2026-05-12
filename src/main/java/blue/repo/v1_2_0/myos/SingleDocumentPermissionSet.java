package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5cZ3J1QiMJEJV4FV5kfSkeG2oJmweWCyJo3v2TSc3Xuw")
public class SingleDocumentPermissionSet {
    public static String blueId() {
        return "5cZ3J1QiMJEJV4FV5kfSkeG2oJmweWCyJo3v2TSc3Xuw";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Set";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Set";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/SingleDocumentPermissionSet.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean read;

    private Boolean allOps;

    private Boolean share;

    private List<String> singleOps;

    public Boolean getRead() {
        return read;
    }

    public SingleDocumentPermissionSet read(Boolean read) {
        this.read = read;
        return this;
    }

    public Boolean getAllOps() {
        return allOps;
    }

    public SingleDocumentPermissionSet allOps(Boolean allOps) {
        this.allOps = allOps;
        return this;
    }

    public Boolean getShare() {
        return share;
    }

    public SingleDocumentPermissionSet share(Boolean share) {
        this.share = share;
        return this;
    }

    public List<String> getSingleOps() {
        return singleOps;
    }

    public SingleDocumentPermissionSet singleOps(List<String> singleOps) {
        this.singleOps = singleOps;
        return this;
    }

}
