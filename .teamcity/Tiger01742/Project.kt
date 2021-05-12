package Tiger01742

import Tiger01742.buildTypes.*
import Tiger01742.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01742")
    name = "Tiger01742"

    vcsRoot(Tiger01742_cVCSroot)

    buildType(Tiger01742_Hi3)
    buildType(Tiger01742_Hi1)
    buildType(Tiger01742_Hi2)
    buildType(Tiger01742_Hi0)
})
