import java.util.HashMap;

public class PipelineConfig {

    String path;
    FileType fileType;
    HashMap<HashMap<Object, Object>, Object>  config;


    PipelineConfig(String path, FileType fileType) {
        this.path = path;
        this.fileType = fileType;
        this.config = parseConfigFile(path, fileType);
    }

    private HashMap<HashMap<Object, Object>, Object> parseConfigFile(String path, FileType fileType) {
        return new HashMap<HashMap<Object, Object>, Object>();
    }


}
