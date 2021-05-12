package Tiger01137

import Tiger01137.buildTypes.*
import Tiger01137.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01137")
    name = "Tiger01137"

    vcsRoot(Tiger01137_cVCSroot)

    buildType(Tiger01137_Hi1)
    buildType(Tiger01137_Hi2)
    buildType(Tiger01137_Hi0)
    buildType(Tiger01137_Hi3)
})
