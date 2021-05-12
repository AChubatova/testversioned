package Tiger01824

import Tiger01824.buildTypes.*
import Tiger01824.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01824")
    name = "Tiger01824"

    vcsRoot(Tiger01824_cVCSroot)

    buildType(Tiger01824_Hi0)
    buildType(Tiger01824_Hi1)
    buildType(Tiger01824_Hi2)
    buildType(Tiger01824_Hi3)
})
