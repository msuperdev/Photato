package com.trebonius.phototo.core.metadata;

import com.trebonius.phototo.helpers.Tuple;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public interface IMetadataAggregator {

    Metadata getMetadata(Path path, long lastModifiedTimestamp);

    Map<Path, Metadata> getMetadatas(List<Tuple<Path, Long>> paths);
}
