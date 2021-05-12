package Tiger01348

import Tiger01348.buildTypes.*
import Tiger01348.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01348")
    name = "Tiger01348"

    vcsRoot(Tiger01348_cVCSroot)

    buildType(Tiger01348_Hi0)
    buildType(Tiger01348_Hi2)
    buildType(Tiger01348_Hi1)
    buildType(Tiger01348_Hi3)
})
