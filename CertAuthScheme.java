//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.jayway.restassured.authentication;

import com.jayway.restassured.internal.http.HTTPBuilder;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.security.KeyStore;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class CertAuthScheme implements AuthenticationScheme, GroovyObject {
    private Object pathToKeyStore;
    private String keyStorePassword;
    private String keystoreType;
    private Object pathToTrustStore;
    private String trustStorePassword;
    private String trustStoreType;
    private int port;
    private KeyStore trustStore;
    private KeyStore keyStore;
    private X509HostnameVerifier x509HostnameVerifier;
    private SSLSocketFactory sslSocketFactory;

    public CertAuthScheme() {
        CallSite[] var1 = $getCallSiteArray();
        Object var2 = var1[0].call(KeyStore.class);
        this.keystoreType = (String)ShortTypeHandling.castToString(var2);
        Object var3 = var1[1].call(KeyStore.class);
        this.trustStoreType = (String)ShortTypeHandling.castToString(var3);
        Integer var4 = -1;
        this.port = var4;
        MetaClass var5 = this.$getStaticMetaClass();
        this.metaClass = var5;
    }

    public void authenticate(HTTPBuilder httpBuilder) {
        CallSite[] var2 = $getCallSiteArray();
        var2[2].call(var2[3].callGetProperty(httpBuilder), ArrayUtil.createArray(this.pathToKeyStore, this.keyStorePassword, this.keystoreType, this.keyStore, this.pathToTrustStore, this.trustStorePassword, this.trustStoreType, this.trustStore, this.port, this.x509HostnameVerifier, this.sslSocketFactory));
    }

    public Object getPathToKeyStore() {
        return this.pathToKeyStore;
    }

    public void setPathToKeyStore(Object var1) {
        this.pathToKeyStore = var1;
    }

    public String getKeyStorePassword() {
        return this.keyStorePassword;
    }

    public void setKeyStorePassword(String var1) {
        this.keyStorePassword = var1;
    }

    public String getKeystoreType() {
        return this.keystoreType;
    }

    public void setKeystoreType(String var1) {
        this.keystoreType = var1;
    }

    public Object getPathToTrustStore() {
        return this.pathToTrustStore;
    }

    public void setPathToTrustStore(Object var1) {
        this.pathToTrustStore = var1;
    }

    public String getTrustStorePassword() {
        return this.trustStorePassword;
    }

    public void setTrustStorePassword(String var1) {
        this.trustStorePassword = var1;
    }

    public String getTrustStoreType() {
        return this.trustStoreType;
    }

    public void setTrustStoreType(String var1) {
        this.trustStoreType = var1;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int var1) {
        this.port = var1;
    }

    public KeyStore getTrustStore() {
        return this.trustStore;
    }

    public void setTrustStore(KeyStore var1) {
        this.trustStore = var1;
    }

    public KeyStore getKeyStore() {
        return this.keyStore;
    }

    public void setKeyStore(KeyStore var1) {
        this.keyStore = var1;
    }

    public X509HostnameVerifier getX509HostnameVerifier() {
        return this.x509HostnameVerifier;
    }

    public void setX509HostnameVerifier(X509HostnameVerifier var1) {
        this.x509HostnameVerifier = var1;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public void setSslSocketFactory(SSLSocketFactory var1) {
        this.sslSocketFactory = var1;
    }
}
