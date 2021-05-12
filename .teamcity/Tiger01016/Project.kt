package Tiger01016

import Tiger01016.buildTypes.*
import Tiger01016.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01016")
    name = "Tiger01016"

    vcsRoot(Tiger01016_cVCSroot)

    buildType(Tiger01016_Hi3)
    buildType(Tiger01016_Hi0)
    buildType(Tiger01016_Hi1)
    buildType(Tiger01016_Hi2)
})
