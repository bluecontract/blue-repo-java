package blue.repo.provider;

import blue.language.NodeProvider;
import blue.language.model.Node;
import blue.language.provider.SequentialNodeProvider;

import java.util.Arrays;
import java.util.List;

public final class CompositeNodeProvider implements NodeProvider {
    private final SequentialNodeProvider delegate;

    private CompositeNodeProvider(List<NodeProvider> providers) {
        this.delegate = new SequentialNodeProvider(providers);
    }

    public static CompositeNodeProvider of(NodeProvider... providers) {
        return new CompositeNodeProvider(Arrays.asList(providers));
    }

    public static CompositeNodeProvider of(List<NodeProvider> providers) {
        return new CompositeNodeProvider(providers);
    }

    @Override
    public List<Node> fetchByBlueId(String blueId) {
        return delegate.fetchByBlueId(blueId);
    }

    public List<NodeProvider> providers() {
        return delegate.getNodeProviders();
    }
}
