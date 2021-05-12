package Tiger01733

import Tiger01733.buildTypes.*
import Tiger01733.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01733")
    name = "Tiger01733"

    vcsRoot(Tiger01733_cVCSroot)

    buildType(Tiger01733_Hi0)
    buildType(Tiger01733_Hi3)
    buildType(Tiger01733_Hi2)
    buildType(Tiger01733_Hi1)
})
