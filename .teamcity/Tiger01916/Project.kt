package Tiger01916

import Tiger01916.buildTypes.*
import Tiger01916.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01916")
    name = "Tiger01916"

    vcsRoot(Tiger01916_cVCSroot)

    buildType(Tiger01916_Hi2)
    buildType(Tiger01916_Hi3)
    buildType(Tiger01916_Hi0)
    buildType(Tiger01916_Hi1)
})
