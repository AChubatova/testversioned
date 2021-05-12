package Tiger01830

import Tiger01830.buildTypes.*
import Tiger01830.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01830")
    name = "Tiger01830"

    vcsRoot(Tiger01830_cVCSroot)

    buildType(Tiger01830_Hi3)
    buildType(Tiger01830_Hi2)
    buildType(Tiger01830_Hi1)
    buildType(Tiger01830_Hi0)
})
