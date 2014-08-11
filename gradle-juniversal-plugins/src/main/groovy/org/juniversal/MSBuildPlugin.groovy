package org.juniversal;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author Bret Johnson
 * @since 7/7/2014 5:58 PM
 */
public class MSBuildPlugin implements Plugin<Project> {
    @Override public void apply(Project target) {
        target.task('msbuild', type: MSBuildTask)
    }
}
