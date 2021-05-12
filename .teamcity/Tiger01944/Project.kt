package Tiger01944

import Tiger01944.buildTypes.*
import Tiger01944.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01944")
    name = "Tiger01944"

    vcsRoot(Tiger01944_cVCSroot)

    buildType(Tiger01944_Hi1)
    buildType(Tiger01944_Hi2)
    buildType(Tiger01944_Hi0)
    buildType(Tiger01944_Hi3)
})
