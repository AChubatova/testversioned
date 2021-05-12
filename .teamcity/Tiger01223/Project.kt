package Tiger01223

import Tiger01223.buildTypes.*
import Tiger01223.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01223")
    name = "Tiger01223"

    vcsRoot(Tiger01223_cVCSroot)

    buildType(Tiger01223_Hi3)
    buildType(Tiger01223_Hi2)
    buildType(Tiger01223_Hi1)
    buildType(Tiger01223_Hi0)
})
