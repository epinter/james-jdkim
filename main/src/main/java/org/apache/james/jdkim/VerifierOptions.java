package org.apache.james.jdkim;

import org.apache.james.jdkim.api.PublicKeyRecordRetriever;
import org.xbill.DNS.Resolver;

import java.time.Duration;

public class VerifierOptions {
    private Duration clockDriftTolerance = Duration.ofSeconds(300);
    private Resolver dnsResolver = null;
    private PublicKeyRecordRetriever publicKeyRecordRetriever = null;

    public VerifierOptions withClockDriftTolerance(Duration tolerance) {
        this.clockDriftTolerance = tolerance;
        return this;
    }

    public VerifierOptions withDnsResolver(Resolver dnsResolver) {
        this.dnsResolver = dnsResolver;
        return this;
    }

    public VerifierOptions withPublicKeyRetriever(PublicKeyRecordRetriever retriever) {
        this.publicKeyRecordRetriever = retriever;
        return this;
    }

    public Duration getClockDriftTolerance() {
        return clockDriftTolerance;
    }

    public Resolver getDnsResolver() {
        return dnsResolver;
    }

    public PublicKeyRecordRetriever getPublicKeyRecordRetriever() {
        return publicKeyRecordRetriever;
    }
}
