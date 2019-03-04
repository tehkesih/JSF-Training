package com.tehkesih.ELResolver;

import com.sun.faces.util.MessageUtils;
import com.tehkesih.ELResolver.ATPSinglesRankings;
import java.beans.FeatureDescriptor;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.PropertyNotFoundException;
import javax.el.PropertyNotWritableException;

/**
 *
 * @author Leonard
 */
public class ATPVarResolver extends ELResolver {

    private static final Logger logger = Logger.getLogger(ATPVarResolver.class.getName());
    private static final String PLAYERS = "atp";
    private final Class<?> CONTENT = ATPSinglesRankings.class;

    @Override
    public Class<?> getCommonPropertyType(ELContext ctx, Object base) {
        if (base != null) {
            return null;
        }
        return String.class;
    }

    @Override
    public Iterator<FeatureDescriptor> getFeatureDescriptors(ELContext ctx, Object base) {
        return null;
    }

    @Override
    public Class<?> getType(ELContext ctx, Object base, Object property) {
        if (base != null) {
            return null;
        }
        if (property == null) {
            String message = MessageUtils.getExceptionMessageString(MessageUtils.NULL_PARAMETERS_ERROR_MESSAGE_ID, "property");
            throw new PropertyNotFoundException(message);
        }
        if ((base == null) && property.equals(PLAYERS)) {
            ctx.setPropertyResolved(true);
            return CONTENT;
        }
        return null;
    }

    @Override
    public Object getValue(ELContext ctx, Object base, Object property) {

        logger.log(Level.INFO, "Get Value property : {0}", property);

        if ((base == null) && property.equals(PLAYERS)) {
            logger.log(Level.INFO, "Found request {0}", base);
            ctx.setPropertyResolved(true);                      
            return new ATPSinglesRankings();
        }
        return null;
    }

    @Override
    public boolean isReadOnly(ELContext ctx, Object base, Object property) {
        return true;
    }

    @Override
    public void setValue(ELContext ctx, Object base, Object property, Object value) {
        if (base != null) {
            return;
        }
        ctx.setPropertyResolved(false);
        if (property == null) {
            String message = MessageUtils.getExceptionMessageString(MessageUtils.NULL_PARAMETERS_ERROR_MESSAGE_ID, "property");
            throw new PropertyNotFoundException(message);
        }
        if (PLAYERS.equals(property)) {
            throw new PropertyNotWritableException((String) property);
        }
    }
}
