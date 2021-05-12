package Tiger056

import Tiger056.buildTypes.*
import Tiger056.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger056")
    name = "Tiger056"

    vcsRoot(Tiger056_cVCSroot)

    buildType(Tiger056_Hi1)
    buildType(Tiger056_Hi0)
    buildType(Tiger056_Hi3)
    buildType(Tiger056_Hi2)
})
