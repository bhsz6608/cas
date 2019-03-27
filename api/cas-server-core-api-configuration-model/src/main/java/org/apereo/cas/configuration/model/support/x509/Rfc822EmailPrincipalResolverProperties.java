package org.apereo.cas.configuration.model.support.x509;

import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;

/**
 * Properties for Rfc822 Email Principal Resolver}.
 * @since 6.1.0
 */
@RequiresModule(name = "cas-server-support-x509-webflow")
@Getter
@Setter
public class Rfc822EmailPrincipalResolverProperties extends BaseAlternativePrincipalResolverProperties {
    private static final long serialVersionUID = -8696449609399074305L;
}
