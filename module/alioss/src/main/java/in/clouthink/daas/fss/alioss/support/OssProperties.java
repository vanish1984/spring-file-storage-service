package in.clouthink.daas.fss.alioss.support;

import java.util.Map;

/**
 * Config for oss client.
 *
 * @author dz
 */
public interface OssProperties {

    /**
     * The oss access key id
     */
    String getKeyId();

    /**
     * The oss access secret
     */
    String getSecret();

    /**
     * The oss domain base
     */
    String getOssDomain();

    /**
     * The img domain base
     */
    String getImgDomain();

    /**
     * The default bucket to store the file which's bucket is not specified for category.
     */
    String getDefaultBucket();

    /**
     * The file's category and bucket mapping, the file will be stored in corresponding bucket for different category,
     * if the bucket is not defined for the file's category , the default bucket will be taken place.
     */
    Map<String, String> getBuckets();

}
