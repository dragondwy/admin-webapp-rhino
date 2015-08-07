package co.youngleader.rhino.adminweb.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import co.youngleader.rhino.adminweb.rest.resource.MyDemoResource;

public class RestJaxRsApplication extends ResourceConfig {

	/**
	 * Register JAX-RS application components.
	 */
	public RestJaxRsApplication() {

		packages("co.youngleader.rhino.adminweb.rest");

		// // register application resources
		 register(MyDemoResource.class);
		// register(PodcastLegacyResource.class);
		//
		// // register filters
		// register(RequestContextFilter.class);
		// register(LoggingResponseFilter.class);
		// register(CORSResponseFilter.class);
		//
		// // register exception mappers
		// register(GenericExceptionMapper.class);
		// register(AppExceptionMapper.class);
		// register(CustomReasonPhraseExceptionMapper.class);
		// register(NotFoundExceptionMapper.class);
		//
		// // register features
		// register(JacksonFeature.class);
		// register(EntityFilteringFeature.class);
		// EncodingFilter.enableFor(this, GZipEncoder.class);

		// property(EntityFilteringFeature.ENTITY_FILTERING_SCOPE, new
		// Annotation[] {PodcastDetailedView.Factory.get()});

		// register features
		register(JacksonFeature.class);
		register(MultiPartFeature.class);

	}

}
