package by.zmitser.webapp.service.impl;


import by.zmitser.webapp.domain.BlogPost;
import by.zmitser.webapp.service.BlogPostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MediumBlogPostImpl implements BlogPostService{

    private static final Logger LOGGER = LoggerFactory.getLogger(MediumBlogPostImpl.class);
    @Override
    public void save(BlogPost blogPost) {
        LOGGER.debug("MediumBlogPostImpl: save() method is called!");
    }
}