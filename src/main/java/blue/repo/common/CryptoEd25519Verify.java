package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6P98bLNKcsNPUovBBsLu6W3BQnrg6F8TPjhbZhegrDSL")
public class CryptoEd25519Verify {
    public static String blueId() {
        return "6P98bLNKcsNPUovBBsLu6W3BQnrg6F8TPjhbZhegrDSL";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Crypto Ed25519 Verify";
    }

    public static String qualifiedName() {
        return "Common/Crypto Ed25519 Verify";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/CryptoEd25519Verify.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String publicKey;

    private String message;

    private String signature;

    public String getPublicKey() {
        return publicKey;
    }

    public CryptoEd25519Verify publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CryptoEd25519Verify message(String message) {
        this.message = message;
        return this;
    }

    public String getSignature() {
        return signature;
    }

    public CryptoEd25519Verify signature(String signature) {
        this.signature = signature;
        return this;
    }

}
